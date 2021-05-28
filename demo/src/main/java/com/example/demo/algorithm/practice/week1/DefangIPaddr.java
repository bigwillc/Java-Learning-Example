package com.example.demo.algorithm.practice.week1;

/**
 * @author bigwillc
 **/
public class DefangIPaddr {
    /*
    *
    * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。

    所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。

             

    示例 1：

    输入：address = "1.1.1.1"
    输出："1[.]1[.]1[.]1"
    示例 2：

    输入：address = "255.100.50.0"
    输出："255[.]100[.]50[.]0"

    来源：力扣（LeetCode）
    链接：https://leetcode-cn.com/problems/defanging-an-ip-address
    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) == '.') {
                sb.append("[.]");
            } else {
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }


}
