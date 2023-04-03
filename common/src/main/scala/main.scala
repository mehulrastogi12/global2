
object main extends App{
  val mylist=new MyParameters()
  val list2=mylist.take_list()
  //val res = PerfectSqaure.countSquares(list2)
  val res1 = new PerfectSqaure
  val res=res1.countSquares(list2)
  println("total number of perfect sqaures are "+res)

}
