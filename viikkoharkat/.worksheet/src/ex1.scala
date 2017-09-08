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
	sqrt(2);System.out.println("""res0: Double = """ + $show(res$0))}
}
