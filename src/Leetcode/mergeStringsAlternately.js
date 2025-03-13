var mergeAlternately = function(word1, word2) {
  let i = 1; ans = '';
  const min = Math.min(word1.length, word2.length);
  while (i <= min) {
      ans += word1[0]; word1 = word1.replace(word1[0], "");
      ans += word2[0]; word2 = word2.replace(word2[0], "")
      i++;
  }

  if (word1) ans += word1;
  if (word2) ans += word2;

  return ans;
};

console.log(mergeAlternately("abc", "pqrs"));