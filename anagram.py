class anagram:
    # function to Group Anagrams that returns list of grouped anagrams
    # strs is the string of words to be grouped
    def group_anagrams(self, strs):
        result = {}
        for i in strs:
            # x stores the sorted word
            x = "".join(sorted(i))
            # if the word is not in the results
            if x not in result:
                result[x] = [i]
                # result[x].append(i)
            else:
                result[x] += [i]
        return list(result.values())


ob1 = anagram()
print(ob1.group_anagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
