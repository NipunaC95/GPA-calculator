object GPA{
    
    def oldGPA( A:String): Double = {
            A match {
                case "A+" => return 4.25;
                case "A"  => return 4.00;
                case "A-" => return 3.75;
                case "B+" => return 3.25;
                case "B"  => return 3.00;
                case "B-" => return 2.75;
                case "C+" => return 2.25;
                case "C"  => return 2.00; 
            }
    }

    def newGPA( A:String): Double = {
        A match {
            case "A+" => return 4.00;
            case "A"  => return 4.00;
            case "A-" => return 3.70;
            case "B+" => return 3.30;
            case "B"  => return 3.00;
            case "B-" => return 2.70;
            case "C+" => return 2.30;
            case "C"  => return 2.00; 
            case "C-" => return 1.30; 
            case "F" => return 1.00;
        }
    }


    def main(args: Array[String]): Unit = {
        //println(oldGPA("A"))
        print("Enter the number of subjects  ") 
        var subCount: Int = scala.io.StdIn.readLine.toInt
        print("Enter the number of credits  ")
        var creditCount: Int = scala.io.StdIn.readLine.toInt
    

        var totalGPV :Double = 0
        var NewtotalGPV :Double = 0
        var GPV :Double = 0 
        var result : String = ""
        var credits :Int =0

        while(subCount>0){
            
            print ("\nEnter the result ")
            result = scala.io.StdIn.readLine

            print ("Enter the number of credits ")
            credits = scala.io.StdIn.readLine.toInt
            
            GPV = oldGPA(result)*credits
            totalGPV += GPV

            GPV = newGPA(result)*credits
            NewtotalGPV += GPV
            subCount= subCount - 1
        }
        
        println("\nOLD scheme ")
        println("GPV is " + totalGPV)
        println("GPA is " + totalGPV/creditCount)

        println("\nnew scheme ")
        println("GPV is " + NewtotalGPV)
        println("GPA is " + NewtotalGPV/creditCount)

    }
}
