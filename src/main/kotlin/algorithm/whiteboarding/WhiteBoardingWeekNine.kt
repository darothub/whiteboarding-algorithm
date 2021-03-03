package algorithm.whiteboarding

class WhiteBoardingWeekNine {

    companion object{
//        Task
//        The height of a binary search tree is the number of edges between the tree's root and its furthest leaf. You are given a pointer,
    //     , pointing to the root of a binary search tree.
    //     Complete the getHeight function provided in your editor so that it returns the height of the binary search tree.
//
//        Input Format
//
//        The locked stub code in your editor reads the following inputs and assembles them into a binary search tree:
//        The first line contains an integer, , denoting the number of nodes in the tree.
//        Each of the  subsequent lines contains an integer, , denoting the value of an element that must be added to the BST.
//
//        Output Format
//
//        The locked stub code in your editor will print the integer returned by your getHeight function denoting the height of the BST.
//
//        Sample Input
//
//        7
//        3
//        5
//        2
//        1
//        4
//        6
//        7
//        Sample Output
//
//      3


//        The Longest path is shown below
//        check url here
//        https://s3.amazonaws.com/hr-challenge-images/17175/1459895368-4955f9ce74-LongestRTL.png

//        There are 4 nodes in this path that are connected by  3 edges, meaning our BST's height = 3' . Thus, we print  3 as our answer.
    }
}

/**
 * Solve here
 */

fun binaryTreeHeight(node: BinaryNode<Int>?): Int{

    return 0
  }

class BinaryNode<T>(val value: T) {

    var leftChild: BinaryNode<T>? = null
    var rightChild: BinaryNode<T>? = null
}