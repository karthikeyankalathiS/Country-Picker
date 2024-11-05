package com.android.countrypicker.view.bottomsheet

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.android.countrypicker.R
import com.android.countrypicker.databinding.CpBottomSheetBinding
import com.android.countrypicker.view.adapter.CountryAdapter
import com.android.countrypicker.data.CountryData
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.countrypicker.countrypicker.model.Country
import java.util.*

class CountryPickerBottomSheet(private val dialogTheme: Int = R.style.BottomSheetDialogTheme) : BottomSheetDialogFragment() {
    private lateinit var binding: CpBottomSheetBinding
    private lateinit var countryAdapter: CountryAdapter
    private var countryList = CountryData.getAllCountries()
    private var filteredCountryList = ArrayList<Country>()

    private var countrySelectionListener: ((Country) -> Unit)? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = CpBottomSheetBinding.inflate(inflater, container, false)
        setupRecyclerView()
        setupCloseButton()
        setupSearchListener()
        return binding.root
    }

    fun setCountrySelectionListener(listener: (Country) -> Unit) {
        this.countrySelectionListener = listener
    }

    private fun setupRecyclerView() {
        filteredCountryList.addAll(countryList)
        countryAdapter = CountryAdapter(filteredCountryList) { selectedCountry ->
            countrySelectionListener?.invoke(selectedCountry)
            dismiss()
        }

        binding.recyclerCountries.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = countryAdapter
        }
    }

    private fun setupCloseButton() {
        binding.btnClose.setOnClickListener {
            dismiss()
        }
    }

    private fun setupSearchListener() {
        binding.searchBox.search.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                filterCountries(s.toString())
            }

            override fun afterTextChanged(s: Editable?) {}
        })
    }

    private fun filterCountries(query: String) {
        val lowerCaseQuery = query.lowercase(Locale.getDefault())
        filteredCountryList.clear()

        if (lowerCaseQuery.isEmpty()) {
            filteredCountryList.addAll(countryList)
        } else {
            filteredCountryList.addAll(
                countryList.filter {
                    it.name.lowercase(Locale.getDefault()).contains(lowerCaseQuery) ||
                            it.code.contains(lowerCaseQuery) ||
                            it.abbreviation.lowercase(Locale.getDefault()).contains(lowerCaseQuery)
                }
            )
        }
        countryAdapter.notifyDataSetChanged()
    }

    override fun getTheme(): Int = dialogTheme

    companion object {
        fun newInstance(theme: Int): CountryPickerBottomSheet {
            return CountryPickerBottomSheet(theme)
        }
    }
}
