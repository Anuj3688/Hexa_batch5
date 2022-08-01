class AbhiAon
{
	public static void main(String[ ]  args){
		
	}
	static void calculateLevelSum(Node node, int level, int sum[])
{
    if (node == null)
        return;
 
    // Add current node data to the sum
    // of the current node's level
    sum[level] += node.data;
 
    // Recursive call for left and right sub-tree
    calculateLevelSum(node.left, level + 1, sum);
    calculateLevelSum(node.right, level + 1, sum);
}
}