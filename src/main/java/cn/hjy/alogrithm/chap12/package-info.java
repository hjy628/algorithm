package cn.hjy.alogrithm.chap12;


/**
 *   算法方向
 *
 *   1.分治算法
 *      把一个复杂的问题分成两个或更多的相同或相似的问题，再把子问题分成更小的子问题，直到最后子问题可以被简单地直接求解，原问题的解即子问题的解的合并
 *      快速排序和二分搜索使用的就是这种思想
 *
 *    2.动态规划
 *          动态规划的基本思想与分治法类似也是将待求解的问题分解为若干个子问题(阶段),
 *          按照顺序求解子问题，前一个子问题的解为后一个子问题的求解提供了有用的信息。
 *          在求解任意子问题时，列出各种可能的局部解，通过决策保留那些有可能达到最优的局部解，丢弃其他局部解。
 *          依次解决各子问题，最后一个子问题就是初始问题的解。
 *          与分治法最大的差别是：适合用动态规划法求解的问题经分解后得到的子问题往往不是互相独立的（即下一个子阶段的求解是建立在上一个子阶段的解的基础上进行进一步的求解）
 *          在寻找最短路径的时候就用到了这种思想。
 *
 *      3.贪心算法
 *          贪心算法是指在对问题求解时，总是作出在当前来看最好的选择。也就是说，不从整体最优方面加以考虑，而是仅考虑在某种意义上局部最优的解。
 *
 *       4.回朔法
 *           回朔法类似于枚举的搜索尝试过程，主要是在搜索尝试的过程中寻找问题的解，当发现条件已不满足求解条件时就“回朔”返回，尝试别的路径。
 *           回朔法是一种优选搜索法，按选优条件向前搜索，以达到目标。
 *           当搜索到某一步时，若发现原先的选择并不优或达不到目标，就退回一步重新选择。
 *           这种走不通就退回再走的方法叫做回朔法，而满足回朔条件的某个状态的点叫做回朔点。
 *           许多复杂的规模较大的问题都可以使用回朔法，回朔法有“通用解题方法”的美称。
 *
 *        5.分之限界法
 *             类似于回朔法，也是一种在问题的解空间树T上搜索问题解的算法。但在一般情况下，分支限界法与回朔法的求解目标不同。
 *             回朔法的求解目标是找出T中满足约束条件的所有解；
 *             而分支限界法的求解目标则是找出满足约束条件的一个解，或者在满足约束条件的解中找出使某一目标的函数值达到极大或者极小的解，即在某种意义下的最优解。
 *
 *
 *      新兴算法：
 *              1.加密算法
 *                      从理论上来说，摘要算法也属于加密算法，MD5、SHA系列的算法都是摘要算法，是不可逆的，也就是无法解密的。
 *                      而RSA、3DES之类的可逆算法，是可以解密的。
 *                      加密算法又分为对称加密算法和非对称加密算法。对称加密算法使用同一密钥进行加解密；而非对称加密算法使用不同的秘钥进行加解密。
 *
 *                2.商业算法
 *                      图像识别算法、推荐算法。
 *
 *         其他算法:
 *              1.基数估计算法
 *                      给定一个数据集，求解数据集的基数(Cardinality,表示一个数据集中不同数据项的数量)是非常普遍的需求。
 *
 *                2.蚁群算法
 *
 *
 *
 *
 *
 *
 *
 *
 * */