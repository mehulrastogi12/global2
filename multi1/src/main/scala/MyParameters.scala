import scala.collection.mutable.ListBuffer
class MyParameters()
{
  def take_list():List[Int]={
    val list=List(0,1,3,8,15,16,17,20,24)
    list
  }
  def Add_one_to_each_element_of_list()={
    print("the smaple list")
  }
  def Add_one_to_each_element_of_list(list:List[Int]):List[Int]= {
    def Add_one(list: List[Int], res: ListBuffer[Int]): List[Int] = {
      if (list.isEmpty)
        res.toList
      else {
        res.append(list.head + 1)
        Add_one(list.tail, res)
      }
    }

    val buff = ListBuffer.empty[Int]
    Add_one(list, buff)
  }

}
