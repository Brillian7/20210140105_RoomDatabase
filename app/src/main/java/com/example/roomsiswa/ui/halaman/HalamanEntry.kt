package com.example.roomsiswa.ui.halaman

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.roomsiswa.R
import com.example.roomsiswa.model.DetailSiswa
import com.example.roomsiswa.navigasi.DestinasiNavigasi

object DestinasiEntry: DestinasiNavigasi {
    override val route = "item_entry"
    override val titleRes = R.string.entity_siswa
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormInputSiswa(
    detailSiswa: DetailSiswa,
    modifier: Modifier = Modifier,
    onValueChange: (DetailSiswa) -> Unit = {},
){

}