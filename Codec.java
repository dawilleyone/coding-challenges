class Codec
{
    static final String DELIMITER = ",";
    static final String NULL = "#";

	public String serialize(TreeNode root)
	{
        if(root == null)
			return "";

		Queue<TreeNode> q = new LinkedList<>();         // LinkedList can store null values
        StringBuilder sb = new StringBuilder();
        q.add(root);

		while(!q.isEmpty())
		{
            TreeNode node = q.poll();

			if(node == null)
			{
                sb.append(NULL).append(DELIMITER);
            }
			else
			{
				sb.append(node.val).append(DELIMITER);
				q.add(node.left);
				q.add(node.right);
			}
        }
        return sb.toString();
    }

    public TreeNode deserialize(String data)
	{
        if(data.isEmpty())
			return null;

        Queue<TreeNode> q = new ArrayDeque<>();
        String[] values = data.split(DELIMITER);
        TreeNode root = new TreeNode(Integer.parseInt(values[0]));
        q.add(root);

        for(int i = 1; i < values.length; i++)
		{
            TreeNode node = q.poll();

            if(!values[i].equals(NULL))
			{
                node.left = new TreeNode(Integer.parseInt(values[i]));
                q.add(node.left);
            }
            if(!values[++i].equals(NULL))
			{
                node.right = new TreeNode(Integer.parseInt(values[i]));
				q.add(node.right);
            }
        }
        return root;
    }
}
