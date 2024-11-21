import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.pam_5.Model.DataSiswa

//@Preview(showBackground = true)
@Composable
fun TampilDataView(modifier: Modifier = Modifier,
                   uiState: DataSiswa,
                   onBackButton: () -> Unit

) {
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        TampilData(parameterName = "Nama", argu = uiState.nama)
        TampilData(parameterName = "Jenis kelamin", argu = uiState.gender)
        TampilData(parameterName = "Alamat", argu = uiState.alamat)
        TampilData(parameterName = "Email", argu = uiState.email)
        TampilData(parameterName = "No Telepon", argu = uiState.notelepon)
        Button(onClick = onBackButton){
            Text(text = "Kembali")
        }
    }
}