package xust;

/*
747. �������������������������
��һ������������nums�У����Ǵ���һ�����Ԫ�� ��
���������е����Ԫ���Ƿ�������������ÿ���������ֵ�������
����ǣ��򷵻����Ԫ�ص����������򷵻�-1��

ʾ�� 1:
����: nums = [3, 6, 1, 0]
���: 1
����: 6����������, ���������е���������,
6��������������Ԫ�ص�������6��������1, �������Ƿ���1.

ʾ�� 2:
����: nums = [1, 2, 3, 4]
���: -1
����: 4û�г���3��������, �������Ƿ��� -1.
��ʾ:
nums �ĳ��ȷ�Χ��[1, 50].
ÿ�� nums[i] ��������Χ�� [0, 99].
 */
/*
 * ������
 * ����ֻ��Ҫ�ҵ������е�������͵ڶ������������index��¼��������������ж�������Ƿ���ڻ���ڵڶ��������������
 * ����ǣ�˵�����������Ҳ��������������������index��������ǣ�����������������-1��
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
766. �������ľ���
���һ�������ÿһ���������ϵ����µĶԽ����Ͼ�����ͬԪ�أ���ô����������������ľ���
����һ�� M x N �ľ��󣬵��ҽ��������������ľ���ʱ���� True��

ʾ�� 1:
����: 
matrix = [
  [1,2,3,4],
  [5,1,2,3],
  [9,5,1,2]
]
���: True
����:
������������, ��Խ���Ϊ:
"[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]"��
�����Խ����ϵ�����Ԫ�ؾ���ͬ, ��˴���True��

ʾ�� 2:
����:
matrix = [
  [1,2],
  [2,2]
]
���: False
����: 
�Խ���"[1, 2]"�ϵ�Ԫ�ز�ͬ��
˵��:
 matrix ��һ�����������Ķ�ά���顣
matrix ���������������� [1, 20]��Χ�ڡ�
matrix[i][j] ������������ [0, 99]��Χ�ڡ�
 */
/*
 * ������
 * ֻ��Ҫ�������е�ÿ�������������½����ֱȽϣ�ע�����鲻��Խ�磬������һ�������һ�в����ñȽϣ����ȽϹ��������в�ͬ������false���Ƚ����ȫ����ͬ������true��
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
771. ��ʯ��ʯͷ
 �����ַ���J ����ʯͷ�б�ʯ�����ͣ����ַ��� S������ӵ�е�ʯͷ�� S ��ÿ���ַ�������һ����ӵ�е�ʯͷ�����ͣ�����֪����ӵ�е�ʯͷ���ж����Ǳ�ʯ��
J �е���ĸ���ظ���J �� S�е������ַ�������ĸ����ĸ���ִ�Сд�����"a"��"A"�ǲ�ͬ���͵�ʯͷ��

ʾ�� 1:
����: J = "aA", S = "aAAbbbb"
���: 3

ʾ�� 2:
����: J = "z", S = "ZZ"
���: 0
ע��:c
S �� J ��ຬ��50����ĸ��
 J �е��ַ����ظ���
 */
/*
 * ������
 * ˫��ѭ��������count����������S�е�ÿһ���ַ�����ÿһ���ַ�һһ��J�е��ַ��Ƚϣ�������ͬ�ģ�count��һ����������ѭ��������S�е���һ���ַ�����󷵻�count��
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