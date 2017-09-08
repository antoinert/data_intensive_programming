object ex1 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(67); 
	//TASK 1
  def sum(x: Int, y: Int): Int = {
		x+y
  };System.out.println("""sum: (x: Int, y: Int)Int""");$skip(25); 
  
  val s = sum(20, 21);System.out.println("""s  : Int = """ + $show(s ));$skip(403); 
 
 
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
 	};System.out.println("""sqrt: (root: Double)Double""");$skip(9); val res$0 = 
	sqrt(2);System.out.println("""res0: Double = """ + $show(res$0));$skip(25); 
	
	var k = Array[Int](1);System.out.println("""k  : Array[Int] = """ + $show(k ));$skip(23); 
	
	k = Array[Int](1,2);$skip(13); 
	
	var i = 0;System.out.println("""i  : Int = """ + $show(i ));$skip(29); 
	for ( i <- k){
		println(i)
	};$skip(528); 
	
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
	};System.out.println("""pascal: (column: Int, row: Int)Int""");$skip(16); val res$1 = 
	
	pascal(2, 4);System.out.println("""res1: Int = """ + $show(res$1));$skip(352); 
	
	//TASK 4

	def balance(chars: List[Char], y: Int = 0, count: Int = 0, count2: Int = 0): Boolean = {
		if (y == chars.length) {
			if (count == count2) true
			else false
		}
		else if (chars(y) == '(') balance(chars, y+1, count+1, count2)
		else if (chars(y) == ')') balance(chars, y+1, count, count2+1)
		else balance(chars, y+1, count, count2)
	};System.out.println("""balance: (chars: List[Char], y: Int, count: Int, count2: Int)Boolean""");$skip(51); 
	
	var list: List[Char] = List('(', 'a', 'b', ')');System.out.println("""list  : List[Char] = """ + $show(list ));$skip(26); 
 
	println(balance(list))}
}
