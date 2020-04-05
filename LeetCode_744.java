给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。

在比较时，数组里字母的是循环有序的。举个例子：

如果目标字母 target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
如果目标字母 target = 'n' 并且有序数组为 letters = ['m', 'z', 'c', 'f', 'j'] ，则答案返回 'z' 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/find-smallest-letter-greater-than-target
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 public static char nextGreatestLetter(char[] letters, char target) {
		 char result = 'z';
		 boolean f = false;
		 for(int i = 0; i < letters.length; i++) {
			if(target < letters[i]) {		
				return letters[i];
			}
			if(i > 0) {
				if(letters[i] < letters[i - 1]) {
					f = true;
					result = letters[i];
				}
			}
		}	
		if(f) {
			return result;
		}
		return letters[0];
	 }
