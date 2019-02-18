package xust;

/*
747. 至少是其他数字两倍的最大数
在一个给定的数组nums中，总是存在一个最大元素 。
查找数组中的最大元素是否至少是数组中每个其他数字的两倍。
如果是，则返回最大元素的索引，否则返回-1。

示例 1:
输入: nums = [3, 6, 1, 0]
输出: 1
解释: 6是最大的整数, 对于数组中的其他整数,
6大于数组中其他元素的两倍。6的索引是1, 所以我们返回1.

示例 2:
输入: nums = [1, 2, 3, 4]
输出: -1
解释: 4没有超过3的两倍大, 所以我们返回 -1.
提示:
nums 的长度范围在[1, 50].
每个 nums[i] 的整数范围在 [0, 99].
 */
/*
 * 分析：
 * 我们只需要找到数组中的最大数和第二大的数，并用index记录最大数的索引，判断最大数是否大于或等于第二大的数的两倍，
 * 如果是，说明最大数至少也是其他数的两倍，返回index，如果不是，则不满足条件，返回-1。
 */
//public class Test_0218 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[] nums = {3, 6, 1, 0};
//		System.out.println(So.dominantIndex(nums));
//	}
//}
//class Solution {
//    public int dominantIndex(int[] nums) {
//    	if(nums.length == 0)
//    		return -1;
//    	if(nums.length == 1)
//    		return 0;
//    	int max = Math.max(nums[0], nums[1]);
//    	int second_max = Math.min(nums[0], nums[1]);
//    	int index = nums[0] > nums[1] ? 0 : 1;
//        for(int i=2; i<nums.length; i++){
//        	if(nums[i] > max){
//        		second_max = max;
//        		max = nums[i];	
//        		index = i;
//        	}	
//        	else if(nums[i]<max && nums[i]>second_max){
//        		second_max = nums[i];
//        	}
//        }
//        return second_max*2 <= max ? index : -1;
//    }
//}
/*
766. 托普利茨矩阵
如果一个矩阵的每一方向由左上到右下的对角线上具有相同元素，那么这个矩阵是托普利茨矩阵。
给定一个 M x N 的矩阵，当且仅当它是托普利茨矩阵时返回 True。

示例 1:
输入: 
matrix = [
  [1,2,3,4],
  [5,1,2,3],
  [9,5,1,2]
]
输出: True
解释:
在上述矩阵中, 其对角线为:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"。
各条对角线上的所有元素均相同, 因此答案是True。

示例 2:
输入:
matrix = [
  [1,2],
  [2,2]
]
输出: False
解释: 
对角线"[1, 2]"上的元素不同。
说明:
 matrix 是一个包含整数的二维数组。
matrix 的行数和列数均在 [1, 20]范围内。
matrix[i][j] 包含的整数在 [0, 99]范围内。
 */
/*
 * 分析：
 * 只需要将矩阵中的每个数与它的右下角数字比较（注意数组不能越界，因此最后一行与最后一列不需用比较），比较过程中若有不同，返回false，比较完毕全部相同，返回true。
 */
//public class Test_0218 {
//	public static void main(String[] args) {
//		Solution So = new Solution();
//		int[][] matrix ={{1,2,3,4}, {5,1,2,3},{9,5,1,2}};
//		System.out.println(So.isToeplitzMatrix(matrix));
//	}
//}
//class Solution {
//    public boolean isToeplitzMatrix(int[][] matrix) {
//        for(int i=0; i<matrix.length-1; i++){
//        	for(int j=0; j<matrix[i].length-1; j++){
//        		if(matrix[i][j] != matrix[i+1][j+1])
//        			return false;
//        	}
//        }
//        return true;
//    }
//}
/*
771. 宝石与石头
 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。

示例 1:
输入: J = "aA", S = "aAAbbbb"
输出: 3

示例 2:
输入: J = "z", S = "ZZ"
输出: 0
注意:c
S 和 J 最多含有50个字母。
 J 中的字符不重复。
 */
/*
 * 分析：
 * 双重循环遍历，count计数，遍历S中的每一个字符，将每一个字符一一与J中的字符比较，遇到相同的，count加一，跳出本层循环，继续S中的下一个字符，最后返回count。
 */
public class Test_0218 {
	public static void main(String[] args) {
		Solution So = new Solution();
		String J = "aA";
	    String S = "aAAbbbb";
	    System.out.println(So.numJewelsInStones(J, S));
	}
}
class Solution {
    public int numJewelsInStones(String J, String S) {
    	int count = 0;
        for(int i=0; i<S.length(); i++){
        	for(int j=0; j<J.length(); j++){
        		if(S.charAt(i) == J.charAt(j)){
        			count++;
        			break;
        		}
        	}
        }
        return count;
    }
}