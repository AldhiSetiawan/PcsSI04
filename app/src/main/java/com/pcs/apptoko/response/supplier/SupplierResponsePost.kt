package com.pcs.apptoko.response.supplier

data class SupplierResponsePost (
    val `data`: DataProduk,
    val message: String,
    val success: Boolean
)


data class DataProduk(
    val `produk`: Supplier
)