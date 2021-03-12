// ArrayLists are used to create dynamic arrays.
fun main() {
    // making Empty ArrayList
    var arrayList1 = ArrayList<String>()
    arrayList1.add("one")
    arrayList1.add("two")
    arrayList1.add("three")
    println("----print ArrayList1----")
    for (i in arrayList1) {
        print(i + " ")
    }
    println("")

    // ArrayList using collections
    var arrayList2: ArrayList<String> = ArrayList<String>(5)
    var list: MutableList<String> = mutableListOf<String>()

    list.add("One")
    list.add("Two")

    arrayList2.addAll(list)
    println("----print ArrayList2----")
    var itr = arrayList2.iterator()
    while(itr.hasNext()) {
        print(itr.next() + " ")
    }
    println("")
    println("Size of arrayList2 = ${arrayList2.size}")

    // get() - to fetch element in ArrayList with given index
    println("arrayList2.get(1) = ${arrayList2.get(1)}")

}