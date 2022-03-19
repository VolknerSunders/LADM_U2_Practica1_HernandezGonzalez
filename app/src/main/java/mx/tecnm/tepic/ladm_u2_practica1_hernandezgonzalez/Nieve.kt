package mx.tecnm.tepic.ladm_u2_practica1_hernandezgonzalez

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import kotlin.random.Random

class Nieve(l:Lienzo) {
    val l = l
    var x = 0f
    var y = 0f
    var velocidad = 0f

    var timer = object : CountDownTimer(500000,15000){
        var d = 0
        override fun onTick(p0: Long) {
            d = (0..100).random()
            if (d in 0..10) {
                l.s = 0
            }else if (d in 11..20){
                l.s = 1
            }else if (d in 21..30){
                l.s = 2
            }else if (d in 31..40){
                l.s = 3
            }else if (d in 41..50){
                l.s = 4
            }else if (d in 51..60){
                l.s = 5
            }else if (d in 61..70){
                l.s = 6
            }else if (d in 71..80){
                l.s = 7
            }else if (d in 81..90){
                l.s = 8
            }else if (d in 91..100){
                l.s = 9
            }
            l.invalidate()

        }

        override fun onFinish() {
            l.s = 0
        }
    }

    val color = Color.WHITE

    init {
        x = rand(1080)
        x += l.widthx.toFloat()
        y = rand(2019)
        velocidad = 5f
        timer.start()
    }

    fun pintar(canvas: Canvas){
        var p = Paint()
        p.strokeWidth = 5f
        p.color = color
        //canvas.drawLine(x,y,xf,yf,p)
        canvas.drawCircle(x,y,5f,p)
    }

    fun mover(){
        x -= velocidad
        if (x <= 0){
            x = 1080f
        }
    }

    private fun rand(hasta:Int) : Float {
        return Random.nextInt(hasta).toFloat()
    }
}