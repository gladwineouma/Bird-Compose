import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp



@Composable
fun Calculator() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    )

        {
        OutlinedTextField(
            value = num1,
            onValueChange = { num1 = it },
            placeholder = {
                Text(text = "Num 1")
            }
        )
            Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = num2,
            onValueChange = {num2 = it},
            placeholder = {
                Text(text = "Num 2")
            }
        )
            Spacer(modifier = Modifier.height(48.dp))

        Row {
            Button(onClick = {
                result = num1.toInt() / num2.toInt()
            }) {
                Text(text = "/")
            }
            Button(onClick = {
                result = num1.toInt() + num2.toInt()
            }) {
                Text(text = "+")

            }
            Button(onClick = {
                result = num1.toInt() * num2.toInt()
            }) {
                Text(text = "*")
            }
            Button(onClick = {
                result = num1.toInt() - num2.toInt()
            }) {
                Text(text = "-")
            }
        }
    }
}






@Preview(showBackground = true)
@Composable
fun CalculatorPreview() {
    Calculator()
}
