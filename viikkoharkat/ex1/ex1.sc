object ex1 {
	//TASK 1
  def sum(x: Int, y: Int): Int = {
		x+y
  }                                               //> sum: (x: Int, y: Int)Int
  
  val s = sum(20, 21)                             //> s  : Int = 41
 
 
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
 	}                                         //> sqrt: (root: Double)Double
	sqrt(2)                                   //> res0: Double = 1.414213562373095
}