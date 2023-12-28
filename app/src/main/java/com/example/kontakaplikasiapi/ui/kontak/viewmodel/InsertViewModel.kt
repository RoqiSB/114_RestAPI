package com.example.kontakaplikasiapi.ui.kontak.viewmodel

import com.example.kontakaplikasiapi.model.Kontak

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
fun InsertUiEvent.toKontak(): Kontak = Kontak(
    id = id,
    nama = nama,
    alamat = email,
    telpon = nohp
)