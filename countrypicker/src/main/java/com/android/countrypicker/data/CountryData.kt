package com.android.countrypicker.data

import com.android.countrypicker.R
import com.countrypicker.countrypicker.model.Country

object CountryData {
    fun getAllCountries(): List<Country> {
        return listOf(
            Country("Andorra", "AD", "+376", R.drawable.flag_andorra, "EUR"),
            Country("United Arab Emirates (UAE)", "AE", "+971", R.drawable.flag_uae, "AED"),
            Country("Afghanistan", "AF", "+93", R.drawable.flag_afghanistan, "AFN"),
            Country("Antigua and Barbuda", "AG", "+1", R.drawable.flag_antigua_and_barbuda, "XCD"),
            Country("Anguilla", "AI", "+1", R.drawable.flag_anguilla, "XCD"),
            Country("Albania", "AL", "+355", R.drawable.flag_albania, "ALL"),
            Country("Armenia", "AM", "+374", R.drawable.flag_armenia, "AMD"),
            Country("Angola", "AO", "+244", R.drawable.flag_angola, "AOA"),
            Country("Antarctica", "AQ", "+672", R.drawable.flag_antarctica, "None"),
            Country("Argentina", "AR", "+54", R.drawable.flag_argentina, "ARS"),
            Country("American Samoa", "AS", "+1", R.drawable.flag_american_samoa, "USD"),
            Country("Austria", "AT", "+43", R.drawable.flag_austria, "EUR"),
            Country("Australia", "AU", "+61", R.drawable.flag_australia, "AUD"),
            Country("Aruba", "AW", "+297", R.drawable.flag_aruba, "AWG"),
            Country("Åland Islands", "AX", "+358", R.drawable.flag_aland, "EUR"),
            Country("Azerbaijan", "AZ", "+994", R.drawable.flag_azerbaijan, "AZN"),
            Country("Bosnia And Herzegovina", "BA", "+387", R.drawable.flag_bosnia, "BAM"),
            Country("Barbados", "BB", "+1", R.drawable.flag_barbados, "BBD"),
            Country("Bangladesh", "BD", "+880", R.drawable.flag_bangladesh, "BDT"),
            Country("Belgium", "BE", "+32", R.drawable.flag_belgium, "EUR"),
            Country("Burkina Faso", "BF", "+226", R.drawable.flag_burkina_faso, "XOF"),
            Country("Bulgaria", "BG", "+359", R.drawable.flag_bulgaria, "BGN"),
            Country("Bahrain", "BH", "+973", R.drawable.flag_bahrain, "BHD"),
            Country("Burundi", "BI", "+257", R.drawable.flag_burundi, "BIF"),
            Country("Benin", "BJ", "+229", R.drawable.flag_benin, "XOF"),
            Country("Saint Barthélemy", "BL", "+590", R.drawable.flag_saint_barthelemy, "EUR"),
            Country("Bermuda", "BM", "+1", R.drawable.flag_bermuda, "BMD"),
            Country("Brunei Darussalam", "BN", "+673", R.drawable.flag_brunei, "BND"),
            Country("Bolivia, Plurinational State Of", "BO", "+591", R.drawable.flag_bolivia, "BOB"),
            Country("Brazil", "BR", "+55", R.drawable.flag_brazil, "BRL"),
            Country("Bahamas", "BS", "+1", R.drawable.flag_bahamas, "BSD"),
            Country("Bhutan", "BT", "+975", R.drawable.flag_bhutan, "BTN"),
            Country("Botswana", "BW", "+267", R.drawable.flag_botswana, "BWP"),
            Country("Belarus", "BY", "+375", R.drawable.flag_belarus, "BYN"),
            Country("Belize", "BZ", "+501", R.drawable.flag_belize, "BZD"),
            Country("Canada", "CA", "+1", R.drawable.flag_canada, "CAD"),
            Country("Cocos (Keeling) Islands", "CC", "+61", R.drawable.flag_cocos, "AUD"),
            Country("Congo, The Democratic Republic Of The", "CD", "+243", R.drawable.flag_democratic_republic_of_the_congo, "CDF"),
            Country("Central African Republic", "CF", "+236", R.drawable.flag_central_african_republic, "XAF"),
            Country("Congo", "CG", "+242", R.drawable.flag_republic_of_the_congo, "XAF"),
            Country("Switzerland", "CH", "+41", R.drawable.flag_switzerland, "CHF"),
            Country("Côte D'ivoire", "CI", "+225", R.drawable.flag_cote_divoire, "XOF"),
            Country("Cook Islands", "CK", "+682", R.drawable.flag_cook_islands, "NZD"),
            Country("Chile", "CL", "+56", R.drawable.flag_chile, "CLP"),
            Country("Cameroon", "CM", "+237", R.drawable.flag_cameroon, "XAF"),
            Country("China", "CN", "+86", R.drawable.flag_china, "CNY"),
            Country("Colombia", "CO", "+57", R.drawable.flag_colombia, "COP"),
            Country("Costa Rica", "CR", "+506", R.drawable.flag_costa_rica, "CRC"),
            Country("Cuba", "CU", "+53", R.drawable.flag_cuba, "CUP"),
            Country("Cape Verde", "CV", "+238", R.drawable.flag_cape_verde, "CVE"),
            Country("Curaçao", "CW", "+599", R.drawable.flag_curacao, "ANG"),
            Country("Christmas Island", "CX", "+61", R.drawable.flag_christmas_island, "AUD"),
            Country("Cyprus", "CY", "+357", R.drawable.flag_cyprus, "EUR"),
            Country("Czech Republic", "CZ", "+420", R.drawable.flag_czech_republic, "CZK"),
            Country("Germany", "DE", "+49", R.drawable.flag_germany, "EUR"),
            Country("Djibouti", "DJ", "+253", R.drawable.flag_djibouti, "DJF"),
            Country("Denmark", "DK", "+45", R.drawable.flag_denmark, "DKK"),
            Country("Dominica", "DM", "+1", R.drawable.flag_dominica, "XCD"),
            Country("Dominican Republic", "DO", "+1", R.drawable.flag_dominican_republic, "DOP"),
            Country("Algeria", "DZ", "+213", R.drawable.flag_algeria, "DZD"),
            Country("Ecuador", "EC", "+593", R.drawable.flag_ecuador, "USD"),
            Country("Estonia", "EE", "+372", R.drawable.flag_estonia, "EUR"),
            Country("Egypt", "EG", "+20", R.drawable.flag_egypt, "EGP"),
            Country("Eritrea", "ER", "+291", R.drawable.flag_eritrea, "ERN"),
            Country("Spain", "ES", "+34", R.drawable.flag_spain, "EUR"),
            Country("Ethiopia", "ET", "+251", R.drawable.flag_ethiopia, "ETB"),
            Country("Finland", "FI", "+358", R.drawable.flag_finland, "EUR"),
            Country("Fiji", "FJ", "+679", R.drawable.flag_fiji, "FJD"),
            Country("Falkland Islands (Malvinas)", "FK", "+500", R.drawable.flag_falkland_islands, "FKP"),
            Country("Micronesia, Federated States Of", "FM", "+691", R.drawable.flag_micronesia, "USD"),
            Country("Faroe Islands", "FO", "+298", R.drawable.flag_faroe_islands, "DKK"),
            Country("France", "FR", "+33", R.drawable.flag_france, "EUR"),
            Country("Gabon", "GA", "+241", R.drawable.flag_gabon, "XAF"),
            Country("United Kingdom", "GB", "+44", R.drawable.flag_united_kingdom, "GBP"),
            Country("Grenada", "GD", "+1", R.drawable.flag_grenada, "XCD"),
            Country("Georgia", "GE", "+995", R.drawable.flag_georgia, "GEL"),
            Country("French Guyana", "GF", "+594", R.drawable.flag_guyane, "EUR"),
            Country("Ghana", "GH", "+233", R.drawable.flag_ghana, "GHS"),
            Country("Gibraltar", "GI", "+350", R.drawable.flag_gibraltar, "GIP"),
            Country("Greenland", "GL", "+299", R.drawable.flag_greenland, "DKK"),
            Country("Gambia", "GM", "+220", R.drawable.flag_gambia, "GMD"),
            Country("Guinea", "GN", "+224", R.drawable.flag_guinea, "GNF"),
            Country("Guadeloupe", "GP", "+450", R.drawable.flag_guadeloupe, "EUR"),
            Country("Equatorial Guinea", "GQ", "+240", R.drawable.flag_equatorial_guinea, "XAF"),
            Country("Greece", "GR", "+30", R.drawable.flag_greece, "EUR"),
            Country("Guatemala", "GT", "+502", R.drawable.flag_guatemala, "GTQ"),
            Country("Guam", "GU", "+1", R.drawable.flag_guam, "USD"),
            Country("Guinea-bissau", "GW", "+245", R.drawable.flag_guinea_bissau, "XOF"),
            Country("Guyana", "GY", "+592", R.drawable.flag_guyana, "GYD"),
            Country("Hong Kong", "HK", "+852", R.drawable.flag_hong_kong, "HKD"),
            Country("Honduras", "HN", "+504", R.drawable.flag_honduras, "HNL"),
            Country("Croatia", "HR", "+385", R.drawable.flag_croatia, "HRK"),
            Country("Haiti", "HT", "+509", R.drawable.flag_haiti, "HTG"),
            Country("Hungary", "HU", "+36", R.drawable.flag_hungary, "HUF"),
            Country("Indonesia", "ID", "+62", R.drawable.flag_indonesia, "IDR"),
            Country("Ireland", "IE", "+353", R.drawable.flag_ireland, "EUR"),
            Country("Israel", "IL", "+972", R.drawable.flag_israel, "ILS"),
            Country("Isle Of Man", "IM", "+44", R.drawable.flag_isleof_man, "GBP"),
            Country("Iceland", "IS", "+354", R.drawable.flag_iceland, "ISK"),
            Country("India", "IN", "+91", R.drawable.flag_india, "INR"),
            Country("British Indian Ocean Territory", "IO", "+246", R.drawable.flag_british_indian_ocean_territory, "USD"),
            Country("Iraq", "IQ", "+964", R.drawable.flag_iraq_new, "IQD"),
            Country("Iran, Islamic Republic Of", "IR", "+98", R.drawable.flag_iran, "IRR"),
            Country("Italy", "IT", "+39", R.drawable.flag_italy, "EUR"),
            Country("Jersey", "JE", "+44", R.drawable.flag_jersey, "GBP"),
            Country("Jamaica", "JM", "+1", R.drawable.flag_jamaica, "JMD"),
            Country("Jordan", "JO", "+962", R.drawable.flag_jordan, "JOD"),
            Country("Japan", "JP", "+81", R.drawable.flag_japan, "JPY"),
            Country("Kenya", "KE", "+254", R.drawable.flag_kenya, "KES"),
            Country("Kyrgyzstan", "KG", "+996", R.drawable.flag_kyrgyzstan, "KGS"),
            Country("Cambodia", "KH", "+855", R.drawable.flag_cambodia, "KHR"),
            Country("Kiribati", "KI", "+686", R.drawable.flag_kiribati, "AUD"),
            Country("Comoros", "KM", "+269", R.drawable.flag_comoros, "KMF"),
            Country("Saint Kitts and Nevis", "KN", "+1", R.drawable.flag_saint_kitts_and_nevis, "XCD"),
            Country("North Korea", "KP", "+850", R.drawable.flag_north_korea, "KPW"),
            Country("South Korea", "KR", "+82", R.drawable.flag_south_korea, "KRW"),
            Country("Kuwait", "KW", "+965", R.drawable.flag_kuwait, "KWD"),
            Country("Cayman Islands", "KY", "+1", R.drawable.flag_cayman_islands, "KYD"),
            Country("Kazakhstan", "KZ", "+7", R.drawable.flag_kazakhstan, "KZT"),
            Country("Lao People's Democratic Republic", "LA", "+856", R.drawable.flag_laos, "LAK"),
            Country("Lebanon", "LB", "+961", R.drawable.flag_lebanon, "LBP"),
            Country("Saint Lucia", "LC", "+1", R.drawable.flag_saint_lucia, "XCD"),
            Country("Liechtenstein", "LI", "+423", R.drawable.flag_liechtenstein, "CHF"),
            Country("Sri Lanka", "LK", "+94", R.drawable.flag_sri_lanka, "LKR"),
            Country("Liberia", "LR", "+231", R.drawable.flag_liberia, "LRD"),
            Country("Lesotho", "LS", "+266", R.drawable.flag_lesotho, "LSL"),
            Country("Lithuania", "LT", "+370", R.drawable.flag_lithuania, "EUR"),
            Country("Luxembourg", "LU", "+352", R.drawable.flag_luxembourg, "EUR"),
            Country("Latvia", "LV", "+371", R.drawable.flag_latvia, "EUR"),
            Country("Libya", "LY", "+218", R.drawable.flag_libya, "LYD"),
            Country("Morocco", "MA", "+212", R.drawable.flag_morocco, "MAD"),
            Country("Monaco", "MC", "+377", R.drawable.flag_monaco, "EUR"),
            Country("Moldova, Republic Of", "MD", "+373", R.drawable.flag_moldova, "MDL"),
            Country("Montenegro", "ME", "+382", R.drawable.flag_of_montenegro, "EUR"),
            Country("Saint Martin", "MF", "+590", R.drawable.flag_saint_martin, "EUR"),
            Country("Madagascar", "MG", "+261", R.drawable.flag_madagascar, "MGA"),
            Country("Marshall Islands", "MH", "+692", R.drawable.flag_marshall_islands, "USD"),
            Country("Macedonia (FYROM)", "MK", "+389", R.drawable.flag_macedonia, "MKD"),
            Country("Mali", "ML", "+223", R.drawable.flag_mali, "XOF"),
            Country("Myanmar", "MM", "+95", R.drawable.flag_myanmar, "MMK"),
            Country("Mongolia", "MN", "+976", R.drawable.flag_mongolia, "MNT"),
            Country("Macau", "MO", "+853", R.drawable.flag_macao, "MOP"),
            Country("Northern Mariana Islands", "MP", "+1", R.drawable.flag_northern_mariana_islands, "USD"),
            Country("Martinique", "MQ", "+596", R.drawable.flag_martinique, "EUR"),
            Country("Mauritania", "MR", "+222", R.drawable.flag_mauritania, "MRU"),
            Country("Montserrat", "MS", "+1", R.drawable.flag_montserrat, "XCD"),
            Country("Malta", "MT", "+356", R.drawable.flag_malta, "EUR"),
            Country("Mauritius", "MU", "+230", R.drawable.flag_mauritius, "MUR"),
            Country("Maldives", "MV", "+960", R.drawable.flag_maldives, "MVR"),
            Country("Malawi", "MW", "+265", R.drawable.flag_malawi, "MWK"),
            Country("Mexico", "MX", "+52", R.drawable.flag_mexico, "MXN"),
            Country("Malaysia", "MY", "+60", R.drawable.flag_malaysia, "MYR"),
            Country("Mozambique", "MZ", "+258", R.drawable.flag_mozambique, "MZN"),
            Country("Namibia", "NA", "+264", R.drawable.flag_namibia, "NAD"),
            Country("New Caledonia", "NC", "+687", R.drawable.flag_new_caledonia, "XPF"),
            Country("Niger", "NE", "+227", R.drawable.flag_niger, "XOF"),
            Country("Norfolk Islands", "NF", "+672", R.drawable.flag_norfolk_island, "AUD"),
            Country("Nigeria", "NG", "+234", R.drawable.flag_nigeria, "NGN"),
            Country("Nicaragua", "NI", "+505", R.drawable.flag_nicaragua, "NIO"),
            Country("Netherlands", "NL", "+31", R.drawable.flag_netherlands, "EUR"),
            Country("Norway", "NO", "+47", R.drawable.flag_norway, "NOK"),
            Country("Nepal", "NP", "+977", R.drawable.flag_nepal, "NPR"),
            Country("Nauru", "NR", "+674", R.drawable.flag_nauru, "AUD"),
            Country("Niue", "NU", "+683", R.drawable.flag_niue, "NZD"),
            Country("New Zealand", "NZ", "+64", R.drawable.flag_new_zealand, "NZD"),
            Country("Oman", "OM", "+968", R.drawable.flag_oman, "OMR"),
            Country("Panama", "PA", "+507", R.drawable.flag_panama, "PAB"),
            Country("Peru", "PE", "+51", R.drawable.flag_peru, "PEN"),
            Country("French Polynesia", "PF", "+689", R.drawable.flag_french_polynesia, "XPF"),
            Country("Papua New Guinea", "PG", "+675", R.drawable.flag_papua_new_guinea, "PGK"),
            Country("Philippines", "PH", "+63", R.drawable.flag_philippines, "PHP"),
            Country("Pakistan", "PK", "+92", R.drawable.flag_pakistan, "PKR"),
            Country("Poland", "PL", "+48", R.drawable.flag_poland, "PLN"),
            Country("Saint Pierre And Miquelon", "PM", "+508", R.drawable.flag_saint_pierre, "EUR"),
            Country("Pitcairn Islands", "PN", "+870", R.drawable.flag_pitcairn_islands, "NZD"),
            Country("Puerto Rico", "PR", "+1", R.drawable.flag_puerto_rico, "USD"),
            Country("Palestine", "PS", "+970", R.drawable.flag_palestine, "ILS"),
            Country("Portugal", "PT", "+351", R.drawable.flag_portugal, "EUR"),
            Country("Palau", "PW", "+680", R.drawable.flag_palau, "USD"),
            Country("Paraguay", "PY", "+595", R.drawable.flag_paraguay, "PYG"),
            Country("Qatar", "QA", "+974", R.drawable.flag_qatar, "QAR"),
            Country("Réunion", "RE", "+262", R.drawable.flag_martinique, "EUR"),
            Country("Romania", "RO", "+40", R.drawable.flag_romania, "RON"),
            Country("Serbia", "RS", "+381", R.drawable.flag_serbia, "RSD"),
            Country("Russian Federation", "RU", "+7", R.drawable.flag_russian_federation, "RUB"),
            Country("Rwanda", "RW", "+250", R.drawable.flag_rwanda, "RWF"),
            Country("Saudi Arabia", "SA", "+966", R.drawable.flag_saudi_arabia, "SAR"),
            Country("Solomon Islands", "SB", "+677", R.drawable.flag_soloman_islands, "SBD"),
            Country("Seychelles", "SC", "+248", R.drawable.flag_seychelles, "SCR"),
            Country("Sudan", "SD", "+249", R.drawable.flag_sudan, "SDG"),
            Country("Sweden", "SE", "+46", R.drawable.flag_sweden, "SEK"),
            Country("Singapore", "SG", "+65", R.drawable.flag_singapore, "SGD"),
            Country("Saint Helena, Ascension And Tristan Da Cunha", "SH", "+290", R.drawable.flag_saint_helena, "SHP"),
            Country("Slovenia", "SI", "+386", R.drawable.flag_slovenia, "EUR"),
            Country("Slovakia", "SK", "+421", R.drawable.flag_slovakia, "EUR"),
            Country("Sierra Leone", "SL", "+232", R.drawable.flag_sierra_leone, "SLL"),
            Country("San Marino", "SM", "+378", R.drawable.flag_san_marino, "EUR"),
            Country("Senegal", "SN", "+221", R.drawable.flag_senegal, "XOF"),
            Country("Somalia", "SO", "+252", R.drawable.flag_somalia, "SOS"),
            Country("Suriname", "SR", "+597", R.drawable.flag_suriname, "SRD"),
            Country("South Sudan", "SS", "+211", R.drawable.flag_south_sudan, "SSP"),
            Country("Sao Tome And Principe", "ST", "+239", R.drawable.flag_sao_tome_and_principe, "STN"),
            Country("El Salvador", "SV", "+503", R.drawable.flag_el_salvador, "USD"),
            Country("Sint Maarten", "SX", "+1", R.drawable.flag_sint_maarten, "ANG"),
            Country("Syrian Arab Republic", "SY", "+963", R.drawable.flag_syria, "SYP"),
            Country("Swaziland", "SZ", "+268", R.drawable.flag_swaziland, "SZL"),
            Country("Turks and Caicos Islands", "TC", "+1", R.drawable.flag_turks_and_caicos_islands, "USD"),
            Country("Chad", "TD", "+235", R.drawable.flag_chad, "XAF"),
            Country("Togo", "TG", "+228", R.drawable.flag_togo, "XOF"),
            Country("Thailand", "TH", "+66", R.drawable.flag_thailand, "THB"),
            Country("Tajikistan", "TJ", "+992", R.drawable.flag_tajikistan, "TJS"),
            Country("Tokelau", "TK", "+690", R.drawable.flag_tokelau, "NZD"),
            Country("Timor-leste", "TL", "+670", R.drawable.flag_timor_leste, "USD"),
            Country("Turkmenistan", "TM", "+993", R.drawable.flag_turkmenistan, "TMT"),
            Country("Tunisia", "TN", "+216", R.drawable.flag_tunisia, "TND"),
            Country("Tonga", "TO", "+676", R.drawable.flag_tonga, "TOP"),
            Country("Turkey", "TR", "+90", R.drawable.flag_turkey, "TRY"),
            Country("Trinidad & Tobago", "TT", "+1", R.drawable.flag_trinidad_and_tobago, "TTD"),
            Country("Tuvalu", "TV", "+688", R.drawable.flag_tuvalu, "AUD"),
            Country("Taiwan", "TW", "+886", R.drawable.flag_taiwan, "TWD"),
            Country("Tanzania, United Republic Of", "TZ", "+255", R.drawable.flag_tanzania, "TZS"),
            Country("Ukraine", "UA", "+380", R.drawable.flag_ukraine, "UAH"),
            Country("Uganda", "UG", "+256", R.drawable.flag_uganda, "UGX"),
            Country("United States", "US", "+1", R.drawable.flag_united_states_of_america, "USD"),
            Country("Uruguay", "UY", "+598", R.drawable.flag_uruguay, "UYU"),
            Country("Uzbekistan", "UZ", "+998", R.drawable.flag_uzbekistan, "UZS"),
            Country("Holy See (Vatican City State)", "VA", "+379", R.drawable.flag_vatican_city, "EUR"),
            Country("Saint Vincent & The Grenadines", "VC", "+1", R.drawable.flag_saint_vicent_and_the_grenadines, "XCD"),
            Country("Venezuela, Bolivarian Republic Of", "VE", "+58", R.drawable.flag_venezuela, "VES"),
            Country("British Virgin Islands", "VG", "+1", R.drawable.flag_british_virgin_islands, "USD"),
            Country("US Virgin Islands", "VI", "+1", R.drawable.flag_us_virgin_islands, "USD"),
            Country("Vietnam", "VN", "+84", R.drawable.flag_vietnam, "VND"),
            Country("Vanuatu", "VU", "+678", R.drawable.flag_vanuatu, "VUV"),
            Country("Wallis And Futuna", "WF", "+681", R.drawable.flag_wallis_and_futuna, "XPF"),
            Country("Samoa", "WS", "+685", R.drawable.flag_samoa, "WST"),
            Country("Kosovo", "XK", "+383", R.drawable.flag_kosovo, "EUR"),
            Country("Yemen", "YE", "+967", R.drawable.flag_yemen, "YER"),
            Country("Mayotte", "YT", "+262", R.drawable.flag_martinique, "EUR"),
            Country("South Africa", "ZA", "+27", R.drawable.flag_south_africa, "ZAR"),
            Country("Zambia", "ZM", "+260", R.drawable.flag_zambia, "ZMW"),
            Country("Zimbabwe", "ZW", "+263", R.drawable.flag_zimbabwe, "ZWL")
        )
    }
}
