class Solution:
    def findPermutationDifference(self, s: str, t: str) -> int:
        index1={char : index for index, char in enumerate(s)}
        index2={char : index for index, char in enumerate(t)}
        permutation_diff=0

        for char in s:
            permutation_diff += abs(index1[char] - index2[char])

        return permutation_diff
        