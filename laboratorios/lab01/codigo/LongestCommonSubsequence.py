
def adn(cadena1, cadena2):
  '''Función que halla la longitud de la subsecuencia común más larga entre dos cadenas'''
    if(len(cadena1) == 0 or len(cadena2)==0):
        return 0
    if(cadena1[len(cadena1)-1] == cadena2[len(cadena2)-1]):
        return adn(cadena1[:len(cadena1)-1], cadena2[:len(cadena2)-1]) + 1
    return max(adn(cadena1[:len(cadena1)-1], cadena2), adn(cadena1, cadena2[:len(cadena2)-1]))



