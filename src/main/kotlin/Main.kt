import java.lang.System.`in`
import java.util.*

fun main(){

    val arr = arrayOf(1,22,31,48,57,62,72,86,91,110,114,126,134,149,150)
    val scanner = Scanner(`in`)
    print("Enter a Number to get the Index: ")
    val numToFind = scanner.nextInt()
    print("\nElement $numToFind is at Index Position ${binarySearch(arr,numToFind)}")

}

fun binarySearch(arr:Array<Int>,x:Int) : Int{
    var right: Int = arr.size-1; var left = 0; var mid : Int = (right+left)/2
    while (left<right){
        if (x==arr[mid]) return mid
        if (x < arr[mid]) right = mid-1
        if (x>arr[mid]) left = mid+1
        mid = (left+right)/2
    }
    return -1
}
