<!DOCTYPE html>
<html>
    <head>
    <link rel="stylesheet" type="text/css" href="cart.css">
    </head>
    <body style=' background-image: url(images/background/4.jpg);background-size: cover;background-position: center;
    font-family: sans-serif;
    background-repeat: no-repeat;
    height: 100%;'>
        <div class="p">
            <?php 
                echo "<p style=' margin-top: 50px;font-size:30px;margin-left:460px;color:blue'>Product Information </p>" ;
                echo "<p style=' margin-top: 70px;font-size:30px;margin-left:200px;color:blue'>Product Owner Information </p>" ;
                
                $mysqli = new mysqli("localhost", "root", "", "sbedata");
            
                if($mysqli === false){
                    die("ERROR: Could not connect. " . $mysqli->connect_error);
                }
                
                $sql = "SELECT * FROM sell";
                if($result = $mysqli->query($sql)){
                    
                    if($result->num_rows > 0){
                        
                        echo "<p style=' margin-top: 50px;font-size:30px;margin-left:200px;float:left'></p>"."<table border=3>";
                            echo "<tr style='background-color:green;color:white'>";
                                echo "<th style='width:70px'>Id</th>";
                                echo "<th style='width:90px;'>Name </th>";
                                echo "<th style='width:140px;'>Address</th>";
                                echo "<th style='width:140px;'>Phone Number </th>";
                                echo "<th>Email</th>";
                            echo "</tr>";
                        while($row = $result->fetch_array()){
                            echo "<tr>";
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['id'] . "</td>";
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['name'] . "</td>";
                                echo "<td  style='text-align:center;background-color:blue;color:white'>" . $row['address'] . "</td>";
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['phone_number'] . "</td>";
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['email'] . "</td>";
                            echo "</tr>";
                        }
                        echo "</table>";
                        $result->free();
                    } else{
                        echo "No records matching your query were found.";
                    }
                } else{
                    echo "ERROR: Could not able to execute $sql. " . $mysqli->error;
                }
                
                echo "<p style=' margin-top: 70px;font-size:30px;margin-left:200px;color:blue;'>Product  Information </p>" ;
                $sql = "SELECT * FROM sell1";
                if($result = $mysqli->query($sql)){
                    
                    if($result->num_rows > 0){
                        
                        echo "<p style=' margin-top: 50px;font-size:30px;margin-left:200px;float:left'></p>"."<table border=3>";
                            echo "<tr style='background-color:green;color:white'>";
                                echo "<th style='width:140px'>Product Id</th>";
                                echo "<th style='width:140px;'>Product Type </th>";
                                echo "<th style='width:300px;'>Product Image</th>";
                                echo "<th style='width:140px;'>Product Model</th>";
                                echo "<th style='width:140px;'>Product Price </th>";
                                
                            echo "</tr>";
                    while($row = $result->fetch_array()){
                            echo "<tr>";
                        
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_id'] . "</td>";
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_type'] . "</td>"; 
                            
                                echo '<td style="text-align:center;background-color:blue;color:white"> <img src="data:image/jpeg;base64,'.base64_encode($row['product_image'] ).'" height="200" width="200" class="img-thumnail" /></td>';
                                echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_model'] . "</td>";
                                echo "<td style='text-align:center;background-color:blue;color:white'>"."$ " . $row['product_price'] . "</td>";
                            echo "</tr>";
                        }
                        echo "</table>";
                        $result->free();
                    } else{
                        echo "No records matching your query were found.";
                    }
                } else{
                    echo "ERROR: Could not able to execute $sql. " . $mysqli->error;
                }
                
                // Close connection
                $mysqli->close();
            ?>
            
            
        </div>
    </body>

</html>


