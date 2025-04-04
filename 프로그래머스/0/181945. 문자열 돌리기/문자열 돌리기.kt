fun main(args: Array<String>) {
    val s1 = readLine()!!
    
    print(s1.indices.joinToString(""){"${s1[it]}\n"})

}