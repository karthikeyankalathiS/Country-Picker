package com.android.countrypicker.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.android.countrypicker.databinding.CpItemLayoutBinding
import com.countrypicker.countrypicker.model.Country

class CountryAdapter(
    private val countries: List<Country>,
    private val onCountrySelected: (Country) -> Unit
) : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {

    inner class CountryViewHolder(private val binding: CpItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(country: Country) {
            binding.imageFlag.setImageResource(country.flagResId)
            binding.textViewCountryName.text = "${country.name} (${country.abbreviation})"
            binding.textViewCode.text = country.code

            binding.root.setOnClickListener {
                onCountrySelected(country)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val binding = CpItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.bind(countries[position])
    }

    override fun getItemCount(): Int = countries.size
}
