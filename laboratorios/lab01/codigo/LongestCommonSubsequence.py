
def adn(chain1, chain2):
  '''Function which find the longest common subsequence between two chains'''
    if(len(chain1) == 0 or len(chain2)==0):
        return 0
    if(chain1[len(chain1)-1] == chain2[len(chain2)-1]):
        return adn(chain1[:len(chain1)-1], chain2[:len(chain2)-1]) + 1
    return max(adn(chain1[:len(cadena1)-1], chain2), adn(chain1, chain2[:len(chain2)-1]))



