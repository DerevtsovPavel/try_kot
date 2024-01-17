import kotlin.random.Random
import func.* // модуль functions
/*ФУНКЦИИИ
* fun имя (парметр:тип): возврощаемый тип {}*/


fun main(){
  print("Введите длину массива: ")
  val n:Int = readln()!!.toInt()

  print("Если вы хотите заполнить массив вручную, введите 2 ")
  var a = readln()!!.toByte()

  var ar:Array<Int>
  if (a == 2.toByte())
    ar = hand_array(n)
  else {
    println("Введите миниму")
    var min = readln()!!.toInt()
    println("Введите максимум")
    var max = readln()!!.toInt()
    ar = rand_array(n, min, max)
  }

  println("Массив")
  print_array(ar)
  println()
  sort_min_max(ar)
  println("Сортированный массив")
  print_array(ar)
  println()
}