package mx.tecnm.tepic.ladm_u2_practica1_hernandezgonzalez

import android.annotation.SuppressLint
import android.app.job.JobScheduler
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.os.CountDownTimer
import android.util.DisplayMetrics
import android.view.View
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.*
import kotlin.concurrent.timer
import kotlin.random.Random.Default.nextInt

class Lienzo (este:MainActivity) : View(este) {
    val este = este

    val displayMetrics = DisplayMetrics()
    @SuppressLint("NewApi")
    @Suppress("DEPRECATION")
    val windowman = este.display?.getRealMetrics(displayMetrics)
    var widthx = displayMetrics.widthPixels
    var heightx = displayMetrics.heightPixels

    var nieve0 = Array<Nieve>(100 , { Nieve(this) } )
    var nieve1 = Array<Nieve>(200 , { Nieve(this) } )
    var nieve2 = Array<Nieve>(300 , { Nieve(this) } )
    var nieve3 = Array<Nieve>(400 , { Nieve(this) } )
    var nieve4 = Array<Nieve>(500 , { Nieve(this) } )
    var nieve5 = Array<Nieve>(600 , { Nieve(this) } )
    var nieve6 = Array<Nieve>(700 , { Nieve(this) } )
    var nieve7 = Array<Nieve>(800 , { Nieve(this) } )
    var nieve8 = Array<Nieve>(900 , { Nieve(this) } )
    var nieve9 = Array<Nieve>(1000 , { Nieve(this) } )

    var s = 0

    val coroutina = GlobalScope.launch {
        while(true){
            este.runOnUiThread{
                invalidate()
            }
            delay(50L)
        }
    }

    override fun onDraw(c: Canvas) {
        super.onDraw(c)
        val p = Paint()
        c.drawColor(Color.DKGRAY)
        //Hielo en piso
        p.color = Color.rgb(171,209,243)
        c.drawOval(-200f,500f,600f,1600f,p)
        c.drawOval(-300f,-20f,400f,1000f,p)
        c.drawOval(-100f,1500f,500f,2500f,p)
        //casa
        p.color = Color.rgb(93,41,6)
        c.drawRect(300f,950f,600f,1420f,p)

        p.color = Color.rgb(35,172,196)
        c.drawRect(410f,1180f,480f,1360f,p)

        p.color = Color.rgb(183,111,32)
        c.drawRect(300f,1050f,450f,1140f,p)

        //techo casa
        p.color = Color.rgb(130,73,11)
        c.drawRect(600f,850f,750f,1520f,p)

        p.color = Color.DKGRAY
        p.strokeWidth = 100f
        c.drawLine(600f,850f,800f,900f,p)
        c.drawLine(600f,1520f,800f,1470f,p)

        //chimenea
        p.color = Color.rgb(188,74,60)
        c.drawRect(640f,980f,800f,1050f,p)

        p.color = Color.GRAY
        c.drawOval(820f,980f,860f,1050f,p)
        c.drawOval(880f,1000f,940f,1100f,p)
        c.drawOval(930f,1080f,990f,1250f,p)

        //arboles
        p.color = Color.rgb(93,41,6)
        c.drawRect(-100f,1800f,400f,2100f,p)
        p.color = Color.rgb(66,105,47)
        c.drawOval(370f,1700f,570f,2200f,p)
        c.drawOval(500f,1700f,700f,2200f,p)
        c.drawOval(630f,1700f,830f,2200f,p)

        p.color = Color.rgb(93,41,6)
        c.drawRect(50f,100f,200f,200f,p)
        p.color = Color.rgb(66,105,47)
        c.drawOval(180f,70f,280f,230f,p)
        c.drawOval(250f,70f,350f,230f,p)
        c.drawOval(320f,70f,420f,230f,p)

        p.color = Color.rgb(93,41,6)
        c.drawRect(380f,500f,630f,700f,p)
        p.color = Color.rgb(66,105,47)
        c.drawOval(600f,450f,750f,750f,p)
        c.drawOval(700f,450f,850f,750f,p)
        c.drawOval(800f,450f,950f,750f,p)

        when(s) {
            0 -> {
                (0..nieve0.size - 1).forEach {
                    nieve0[it].mover()
                    nieve0[it].pintar(c)
                }
            }
            1 -> {
                (0..nieve1.size-1).forEach {
                    nieve1[it].mover()
                    nieve1[it].pintar(c)
                }
            }
            2 -> {
                (0..nieve2.size-1).forEach {
                    nieve2[it].mover()
                    nieve2[it].pintar(c)
                }
            }
            3 -> {
                (0..nieve3.size-1).forEach {
                    nieve3[it].mover()
                    nieve3[it].pintar(c)
                }
            }
            4 -> {
                (0..nieve4.size-1).forEach {
                    nieve4[it].mover()
                    nieve4[it].pintar(c)
                }
            }
            5 -> {
                (0..nieve5.size-1).forEach {
                    nieve5[it].mover()
                    nieve5[it].pintar(c)
                }
            }
            6 -> {
                (0..nieve6.size-1).forEach {
                    nieve6[it].mover()
                    nieve6[it].pintar(c)
                }
            }
            7 -> {
                (0..nieve7.size-1).forEach {
                    nieve7[it].mover()
                    nieve7[it].pintar(c)
                }
            }
            8 -> {
                (0..nieve8.size-1).forEach {
                    nieve8[it].mover()
                    nieve8[it].pintar(c)
                }
            }
            9 -> {
                (0..nieve9.size-1).forEach {
                    nieve9[it].mover()
                    nieve9[it].pintar(c)
                }
            }
        }

    }
}