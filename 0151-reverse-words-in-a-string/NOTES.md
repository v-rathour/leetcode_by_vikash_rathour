```
class Solution
{
public String reverseWords (String S)
{
String s = S.trim ();
String str1 = "";
int k = 0;
for (int i = k; i < s.length (); i = k)
{
String str = "";
for (int j = i; j < s.length (); j++)
{
k = j;
char l = s.charAt (j);
if ((int) l == 32 && j != 0)
{
char p = s.charAt (j - 1);
if ((int) p != 32)
str += " ";
break;
}
else
str += l;
}
if (k == s.length () - 1)
{
str1 = str + " " + str1;
k++;
}
else
{
str1 = str + str1;
k++;
}
}
return str1.trim ();
}
}
```