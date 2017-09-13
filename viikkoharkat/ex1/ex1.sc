object ex1 {
	//TASK 1
  def sum(x: Int, y: Int): Int = {
		x+y
  }
  
  val s = sum(20, 21)
 
 
 //TASK 2
 	def sqrt(root: Double): Double = {
 		val initEst: Double = 1
 		val initMean: Double = (initEst+root)/2
 		val initQuo: Double = (root/initEst)
 		
 		def sqrtInit(r: Int = 300, estimation: Double, quotient: Double, mean: Double): Double = {
 			if (r == 0) mean
 			else sqrtInit(r-1, mean, root/mean, (estimation+quotient)/2)
 		}
 		
 		sqrtInit(300, initEst, initQuo, initMean)
 	}
	sqrt(2)
	
	var k = Array[Int](1)
	
	k = Array[Int](1,2)
	
	var i = 0
	for ( i <- k){
		println(i)
	}
	
	//TASK 3
	def pascal(column: Int, row: Int): Int = {
		var z = Array[Int](1)
		
		def roundDone(z: Array[Int], k: Array[Int] = Array[Int](1), y: Int = 1): Array[Int] = {
			if (z.length == y) {
				k(z.length) = 1
				k
			}
			else {
			 	k(y) = z(y)+z(y-1)
			 	roundDone(z, k, y+1)
			}
		}
		
		def iter(z: Array[Int], column: Int, row: Int, y: Int = 0): Int = {
			if (y == row) z(column)
			else {
				var k = new Array[Int](y+2)
				iter(roundDone(z, k), column, row, y+1)
			}
		}
		
		iter(z, column+1, row+1)
	}
	
	pascal(2, 4)
	
	//TASK 4

	def balance(chars: List[Char], y: Int = 0, count: Int = 0, count2: Int = 0): Boolean = {
		if (y == chars.length) {
			if (count == count2) true
			else false
		}
		else if (chars(y) == '(') balance(chars, y+1, count+1, count2)
		else if (chars(y) == ')') balance(chars, y+1, count, count2+1)
		else balance(chars, y+1, count, count2)
	}
	
	var list: List[Char] = List('(', 'a', 'b', ')')
 
	println(balance(list))
	//TASK 5
	
	val a = Array(1, 2, 3, 4, 5)

	println(a.map(v => v*v).reduceLeft((v1, v2) => v1+v2))
	
	
}