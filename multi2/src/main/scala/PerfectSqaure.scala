


class PerfectSqaure  {
 //val mylist=MyParameters()
  //mylist.Add_one_to_each_element_of_list()
  //val a=mylist.take_list()
  def countSquares(list: List[Int]): Int =
  { val mylist= new MyParameters()
   // print(list)
    //mylist.Add_one_to_each_element_of_list()
   val list2=mylist.Add_one_to_each_element_of_list(list)

    val count =  list2.count(x=> Math.sqrt(x)%1==0)
    count
  }



}
