def findDecision(obj): #obj[0]: ph, obj[1]: soil_temperature, obj[2]: soil_moisture, obj[3]: illuminance, obj[4]: env_temperature, obj[5]: env_humidity
   if obj[2]<=66.3:
      if obj[1]>20.0:
         if obj[5]>38.0:
            if obj[3]<=7488.0:
               if obj[4]>18.0:
                  if obj[0]>6.29:
                     return 'yes'
                  elif obj[0]<=6.29:
                     return 'no'
               elif obj[4]<=18.0:
                  return 'no'
            elif obj[3]>7488.0:
               return 'yes'
         elif obj[5]<=38.0:
            return 'no'
      elif obj[1]<=20.0:
         if obj[0]>6.29:
            if obj[4]>18.0:
               if obj[3]<=7488.0:
                  if obj[5]>38.0:
                     return 'no'
            elif obj[4]<=18.0:
               return 'no'
         elif obj[0]<=6.29:
            if obj[4]>18.0:
               if obj[3]<=7488.0:
                  if obj[5]>38.0:
                     return 'yes'
            elif obj[4]<=18.0:
               return 'no'
   elif obj[2]>66.3:
      return 'no'
