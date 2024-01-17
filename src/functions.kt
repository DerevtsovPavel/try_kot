package func
fun hand_array(n:Int):Array<Int>{
  var a = Array<Int>(n, {0})
  for(i in 0..n-1) {
    print("Введите $i элемент: ")
    a[i] = readln()!!.toInt()
  }
  return a
}

fun rand_array(n: Int, min:Int, max:Int):Array<Int>{
  var a = Array<Int> (n, {0})
  for (i in 0..n-1)
    a[i] = (min..max).random()
  return a
}

fun print_array(a:Array<Int>){
  for (i in a.indices)
    print("${a[i]} ")
}

/** возвращает массив, отсортированный от меньшего к большему*/
fun sort_min_max(a:Array<Int>)
{
  for (i in a.indices)
    for (j in i+1..a.size-1)
      if (a[j]<a[i]){
        var b = a[i]
        a[i] = a[j]
        a[j] = b
      }
}