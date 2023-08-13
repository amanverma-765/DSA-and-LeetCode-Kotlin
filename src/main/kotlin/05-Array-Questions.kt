
class ArrayQuestions {

    /*
     question no. 1920
     Build Array from Permutation
     */
    fun buildArray(nums: IntArray): IntArray {
        val array = IntArray(nums.size)
        for (index in nums.indices) {
            array[index] = nums[nums[index]]
        }
        return array
    }

    /*
     question no. 1929
     Concatenation of Array
     */
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val array = IntArray(size * 2)
        nums.forEachIndexed { index, item ->
            array[index] = item
            array[index + size] = item
        }
        return array
    }

    /*
     question no. 1480
     Running Sum of 1d Array
     */
    fun runningSum(nums: IntArray): IntArray {
        val size = nums.size
        val array = IntArray(size)
        var sum = 0
        nums.forEachIndexed { index, item ->
            sum += item
            array[index] = sum
        }
        return array
    }

    /*
     question no. 1672
     Richest Customer Wealth
    */
    fun maximumWealth(accounts: Array<IntArray>): Int {
        var wealth = Int.MIN_VALUE
        accounts.forEach { person ->
            var tempWealth = 0
            person.forEach { wealth ->
                tempWealth += wealth
            }
            if (tempWealth > wealth) wealth = tempWealth
        }
        return wealth
    }

    /*
     question no. 1470
     Shuffle the Array
     */
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val array = IntArray(n * 2)
        for (i in 0..<(nums.size / 2)) {
            array[i * 2] = nums[i]
            array[(i * 2) + 1] = nums[i + n]
        }
        return array
    }

    /*
     question no. 1431
     Kids With the Greatest Number of Candies
     */
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): BooleanArray {
        val array = BooleanArray(candies.size)
        var max = candies[0]
        for (c in candies) {
            if (max < c) max = c
        }
        for (l in candies.indices) {
            array[l] = (candies[l] + extraCandies) >= max
        }
        return array
    }

    /*
     question no. 1431
     Kids With the Greatest Number of Candies
     */

}


