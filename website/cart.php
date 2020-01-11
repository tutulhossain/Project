<?php
    $mysqli = new mysqli("localhost", "root", "", "sbedata");

    if ($mysqli === false) {
        die("ERROR: Could not connect. " . $mysqli->connect_error);
    }
    $product_id = "";
    if (isset($_GET['product_id'])) {
        $product_id = $_GET['product_id'];
        $query      = "DELETE FROM sell1 where product_id='$product_id'";
        $data       = mysqli_query($mysqli, $query);
    }
    $mysqli->close();
?>


<!DOCTYPE html>
<html>
    <head>
        <title>Sell Bye & Exchange </title>
        <link rel="icon" type="image/ico" href="images/tbl.jpg" />
        <link rel="stylesheet" type="text/css" href="cart.css">
    </head>
    <body style=' background-image: url(images/background/5.jpg);background-size: cover;background-position: center;
    font-family: sans-serif;
    background-repeat: no-repeat;
    height: 100%;'>
        <div class="p">
                <?php
                    echo "<p style=' margin-top: 50px;font-size:30px;margin-left:350px;color:white'>Shopping Cart Information </p>";
                    echo "<p style=' margin-top: 70px;font-size:30px;margin-left:150px;color:white'>Product Owner Information </p>";

                    $mysqli = new mysqli("localhost", "root", "", "sbedata");

                    if ($mysqli === false) {
                        die("ERROR: Could not connect. " . $mysqli->connect_error);
                    }

                    $sql = "SELECT * FROM sell,user1 WHERE user1.username=sell.username";
                    if ($result = $mysqli->query($sql)) {
                        
                        if ($result->num_rows > 0) {
                        
                            echo "<p style=' margin-top: 50px;font-size:30px;margin-left:150px;float:left'></p>" . "<table border=3>";
                            echo "<tr style='background-color:green;color:white'>";
                            echo "<th style='width:70px'>Id</th>";
                            echo "<th style='width:90px;'>Name </th>";
                            echo "<th style='width:140px;'>Address</th>";
                            echo "<th style='width:140px;'>Phone Number </th>";
                            echo "<th>Email</th>";
                            echo "</tr>";
                            while ($row = $result->fetch_array()) {
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
                        } else {
                            echo "No records matching your query were found.";
                        }
                    } else {
                    echo "ERROR: Could not able to execute $sql. " . $mysqli->error;
                }

                echo "<p style=' margin-top: 70px;font-size:30px;margin-left:150px;color:white'>Product  Information </p>";
                $sql  = $mysqli->query("SELECT buy.product_id, buy.product_quantity, sell1.product_model,sell1.product_image,sell1.product_price,sell1.product_type FROM buy JOIN sell1 ON buy.product_id = sell1.product_id");
                $sql1 = "SELECT * FROM sell1,user1 WHERE user1.username=sell1.username";

                if ($result = $mysqli->query($sql1)) {
                    if ($result->num_rows > 0) {
                        
                        echo "<p style=' margin-top: 50px;font-size:30px;margin-left:150px;float:left'></p>" . "<table border=3>";
                        echo "<tr style='background-color:green;color:white'>";
                        echo "<th style='width:140px'>Product Id</th>";
                        echo "<th style='width:140px;'>Product Type </th>";
                        echo "<th style='width:300px;'>Product Image</th>";
                        echo "<th style='width:140px;'>Product Model</th>";
                        echo "<th style='width:140px;'>Product Price </th>";
                        echo "<th style='width:140px;'>Product Quantity </th>";
                        
                        echo "</tr>";
                        while ($row = $sql->fetch_array()) {
                            echo "<tr>";
                            
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_id'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_type'] . "</td>";
                            echo '<td style="text-align:center;background-color:blue;color:white"> <img src="data:image/jpeg;base64,' . base64_encode($row['product_image']) . '" height="200" width="200" class="img-thumnail" /></td>';
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_model'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . "$ " . $row['product_price'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . " " . $row['product_quantity'] . "</td>";
                            echo "</tr>";
                        }
                        echo "</table>";
                        $result->free();
                    } else {
                        echo "No records matching your query were found.";
                    }
                } else {
                    echo "ERROR: Could not able to execute $sql. " . $mysqli->error;
                }
                echo "<p style=' margin-top: 70px;font-size:30px;margin-left:150px'>Order Details</p>";
                $sql2 = $sql = $mysqli->query("SELECT buy.product_id, buy.product_quantity, sell1.product_model, sell1.product_price,sell1.product_type FROM buy  JOIN sell1 ON buy.product_id = sell1.product_id");
                $sql1 = "SELECT * FROM sell1,user1 WHERE user1.username=sell1.username";
                if ($result2 = $mysqli->query($sql1)) {
                    $p = 0;
                    if ($result2->num_rows > 0) {
                        
                        echo "<p style=' margin-top: 50px;font-size:30px;margin-left:150px;float:left'></p>" . "<table border=3>";
                        echo "<tr style='background-color:green;color:white'>";
                        echo "<th style='width:140px'>Product Id</th>";
                        echo "<th style='width:140px;'>Product Type </th>";
                        echo "<th style='width:140px;'>Product Model</th>";
                        echo "<th style='width:140px;'>Product Price </th>";
                        echo "<th style='width:140px;'>Product quantity </th>";
                        echo "<th style='width:140px;'>Totail Price </th>";
                        echo "<th style='width:140px;'>Action </th>";
                        
                        echo "</tr>";
                        while ($row = $sql2->fetch_array()) {
                            echo "<tr>";
                            
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_id'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_type'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . $row['product_model'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . "$ " . $row['product_price'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . "" . $row['product_quantity'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . "$" . $row['product_price'] * $row['product_quantity'] . "</td>";
                            echo "<td style='text-align:center;background-color:blue;color:white'>" . "<a href='cart.php?product_id=$row[product_id]'onclick='checkdelete()'style='color:white;text-decoration:none;'>" . "Delete" . "</a>" . "</td>";
                            echo "</tr>";
                            $p = $p + $row['product_price'] * $row['product_quantity'];
                        }
                        echo "<tr>";
                        
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . "</td>";
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . "</td>";
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . "</td>";
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . " " . "</td>";
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . "Totail" . "</td>";
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . "$" . $p . "</td>";
                        echo "<td style='text-align:center;background-color:blue;color:white'>" . " " . "</td>";
                        echo "</tr>";
                        echo "</table>";
                        $result2->free();
                    } else {
                        echo "No records matching your query were found.";
                    }
                } else {
                    echo "ERROR: Could not able to execute $sql2. " . $mysqli->error;
                }

                // Close connection
                $mysqli->close();
            ?>
            
                
        </div>
    </body>

</html>


<script>

function checkdelete 
{
    return confirm('Are Sure Remove the data?');
}
</script>