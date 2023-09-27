package com.dam.laprimera

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.dam.laprimera.ui.theme.LaPrimeraTheme

val NOMBRE = "Lidier Máximo López Raccioppe"
class MainActivity : ComponentActivity() {
    val tag : String = "Estado por ver"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LaPrimeraTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = Color.Transparent) { //lo mismo
                    Saludo(NOMBRE)

                    /*
                    calcular(a = 3,
                        b = 5,
                        fun (numero1:Int, numero2:Int){
                        val suma = numero1+numero2
                        Log.d("calcular", suma.toString())})

                }
                */
            }

                /*
            calcular (4,1, fun(x,y){
                val resta = x - y
                Log.d("calcular", resta.toString())
                })
                 */
            }

            }
        calcular (operacion = {
            Log.d("calcular", "yo no hago nada soy vitrasa y estoy de huelga")
        })
        Log.d(tag,"Estoy en onCreate")
    }
    override fun onStart() {
        super.onStart()
        Log.d(tag,"Estoy en start")
    }
    override fun onResume() {
        super.onResume()
        Log.d(tag, "Estoy en resume")
    }
    override fun onPause() {
        super.onPause()
        Log.d(tag,"HEstoy en pause")
    }
    override fun onStop() {
        super.onStop()
        Log.d(tag, "Estoy en stop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.d(tag, "Estoy en restart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "Estoy en destroy")
    }

    /*
    fun calcular(a : Int = 0, b : Int = 0, operacion : (x:Int,y:Int) -> Unit ){
        //val operacion = a+b

        operacion(a,b)

    }

    */

    fun calcular(a : Int = 0, b : Int = 0, operacion : () -> Unit ){

        operacion()

    }
}
@Composable
fun Saludo(name: String, modifier: Modifier = Modifier) {
    Column {
        Text(
            text = "Me debes 3 dolares $name!",
            modifier = modifier,
            fontSize = 20.sp,
            lineHeight = 30.sp,
            color = Color.Blue,
            textAlign = TextAlign.Left
        )
        Button(onClick = { Log.d("calcular", "Me apretaste")})
            {
                Text(text = "No tocar el botnon")
            }
    }
}




@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LaPrimeraTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = Color.Yellow) { //lo mismo
            Saludo(NOMBRE + "Gran señor de las papas fritas, empanadas y lasañas")
        }
    }
}