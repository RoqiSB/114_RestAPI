package com.example.kontakaplikasiapi.ui.kontak.viewmodel

class InsertViewModel {
}
data class InsertUiState(
    val insertUiEvent: InsertUiEvent = InsertUiEvent(),
)

data class InsertUiEvent(
    val id: Int = 0,
    val nama: String = "",
    val email: String = "",
    val nohp: String = ""
)