<!Doctype html>
<html>

  <head>
    <title>Sell Bye & Exchange </title>
    <link rel="icon" type="image/ico" href="images/tbl.jpg" />
    <link href="styles/after_login.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Dokdo" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Acme" rel="stylesheet">
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' href='https://use.fontawesome.com/releases/v5.7.0/css/all.css' integrity='sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ' crossorigin='anonymous'>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
    <link href="https://fonts.googleapis.com/css?family=Baloo+Chettan" rel="stylesheet">
  </head>

  <body>
      <?php
  $mysqli = new mysqli("localhost", "root", "", "sbedata");

  if ($mysqli === false)
    {
      die("ERROR: Could not connect. " . $mysqli->connect_error);
    }
  $output = "";
  if (isset($_POST['search']))
    {
      $searchq = $_POST['valueToSearch'];
      $sql     = "SELECT * FROM sell1 WHERE product_id LIKE '$searchq' or product_type LIKE '$searchq' LIMIT 1";
      $result  = $mysqli->query($sql);

      if ($result->num_rows > 0)
        {
          while ($row = $result->fetch_array())
            {
              $product_id    = $row['product_id'];
              $product_type  = $row['product_type'];
              $product_model = $row['product_model'];
              $product_image = $row['product_image'];
              $product_price = $row['product_price'];
            }
          $output .= '<div> ' . ' ' . $product_type . '<br>' . '<img src="data:image/jpeg;base64,' . base64_encode($product_image) . '" height="300" width="300" class="img-thumnail" />' . '<br>' . 'Product Type: ' . $product_type . '<br>' . 'Product Id: ' . $product_id . '<br>' . 'Product Model: ' . $product_model . '<br>' . 'Product Price: $' . $product_price . '<br>' . '</div>';

        }
      else
        {
          $output = 'No search a result! Please enter search key carefully. ';
        }
    }
  ?>
          <div class="head">
              <div class="head1">
                  <img src="images/SBElogo.png" height="60px" width="130px">
                  <p>
                      <?php
  $mysqli = new mysqli("localhost", "root", "", "sbedata");

  if ($mysqli === false)
    {
      die("ERROR: Could not connect. " . $mysqli->connect_error);
    }
  $query = "SELECT *FROM user1";
  $data  = mysqli_query($mysqli, $query);
  $row   = $data->fetch_array();
  echo "Welcome" . " " . "Our Website" . " " . "'" . $row['username'] . "'";
  ?>
                  </p>
              </div>
          </div>
          <div class="head3">
              <div class="head2">
                  <a href="cart.php" id="a1"><i class="fa fa-shopping-cart" style="font-size:24px"></i> Cart</a>
                  <a href="index.php" id="a2"><i class='fas fa-user-alt' style='font-size:24px'name="signout"></i> Sign out</a>
              </div>
          </div>
          <div class="head4">
              <ul>
                  <li class="dropdown">
                      <a class="dropbtn">Sell Product <i id="m3" class="fa fa-caret-right" style="font-size:24px"></i></a>
                      <div class="dropdown-content">
                          <a href="sellproduct.php">Mobile</a>
                          <a href="sellproduct.php">Computer </a>
                          <a href="sellproduct.php">Laptop</a>
                          <a href="sellproduct.php">Book</a>
                          <a href="sellproduct.php">Cloth</a>
                          <a href="sellproduct.php">House hold matarials</a>
                          <a href="sellproduct.php">Food</a>
                          <a href="sellproduct.php">Teaching Video</a>
                          <a href="sellproduct.php">Design</a>
                          <a href="sellproduct.php">Idea</a>
                      </div>
                  </li>
                  <li class="dropdown">
                      <a class="dropbtn">Buy Product <i id="m4" class="fa fa-caret-right" style="font-size:24px"></i></a>
                      <div class="dropdown-content">
                          <a href="mobilebuy.php">Mobile</a>
                          <a href="computerbuy.php">Computer </a>
                          <a href="laptopbuy.php">Laptop</a>
                          <a href="bookbuy.php">Book</a>
                          <a href="clothbuy.php">Cloth</a>
                          <a href="householdmatarialsbuy.php">House hold matarials</a>
                          <a href="foodbuy.php">Food</a>
                          <a href="teachingvideobuy.php">Teaching Video</a>
                          <a href="designbuy.php">Design</a>
                          <a href="ideabuy.php">Idea</a>
                      </div>
                  </li>
                  <li class="dropdown">
                      <a class="dropbtn">Exchange Product  <i id="m5" class="fa fa-caret-right" style="font-size:24px"></i></a>
                      <div class="dropdown-content">
                          <a href="exchangeproduct.php">Mobile</a>
                          <a href="exchangeproduct.php">Computer </a>
                          <a href="exchangeproduct.php">Laptop</a>
                          <a href="exchangeproduct.php">Book</a>
                          <a href="exchangeproduct.php">Cloth</a>
                          <a href="exchangeproduct.php">House hold matarials</a>
                          <a href="exchangeproduct.php">Food</a>
                          <a href="exchangeproduct.php">Teaching Video</a>
                          <a href="exchangeproduct.php">Design</a>
                          <a href="exchangeproduct.php">Idea</a>
                          <a href="https://www.travelex.com/">Money Exchange</a>
                      </div>
                  </li>
                  <li><a href="product_information.php">Product Information</a></li>
                  <li><a href="#p12">Contact Us</a></li>
                  <li><a href="after_policy.php">Policy</a></li>
                  <li><a href="after_adminsays.php">Admin says</a></li>
                  <li><a href="after_moneycalculature.php">Calculate Exchange money amount</a></li>
                  <li class="dropdown">
                      <a class="dropbtn">Payment <i id="m4" class="fa fa-caret-right" style="font-size:24px"></i></a>
                      <div class="dropdown-content">
                          <a href="https://www.bkash.com/products-services/payment">Bkash</a>
                          <a href="https://www.paypal.com/us/home">Paypal </a>
                          <a href="https://www.dutchbanglabank.com/">Dutch Bangla Bank Ltd.</a>
                      </div>
                  </li>

              </ul>
          </div>
          <div class="imagesider">

              <form action="after_login.php" method="post">
                  <input type="text" name="valueToSearch" id="ki" placeholder="Enter search key" required="">
                  <br>
                  <br>
                  <input type="submit" name="search" value="Search" id="kj">
                  <br>
                  <br>
              </form>
              <div id="kh">
                  <?php
                    print("$output");
                    ?>
              </div>
          </div>
          <div class="manu2">
              <div class="man">

                  <pre>

                  </pre>
                  <p>Follow Us</p>

                  <a href="https://www.facebook.com/SellBuy-and-Exchange-Website-820168475003610/?modal=admin_todo_tour"><i id="k" class="fa fa-facebook-official"></i></a>
                  <a href="mail.php"><i id="m" class="material-icons" >gmail</i></a>
                  <a href="https://github.com/tutulhossain"><i id="n1" class="fa fa-github" aria-hidden="true"></i></a>

              </div>
              <div class="man1">

                  <pre>

                    </pre>
                  <p>Contract Information
                      <br>
                      <br><i class="fa fa-map-marker" style="font-size:24px"></i> 35/1 Chamilibagh, Dhaka-1217</p>

              </div>
              <div class="man4">

                  <pre>

                  </pre>
                  <p id="p12">Contract Us
                      <br>
                      <br><i id="n6" class="material-icons">call</i> 01884612917 ,01955842425</p>

              </div>
              <div class="man5">

                  <pre>

                </pre>
                  <p id="p13">Support System
                      <br>
                      <br><i id="n9" class="fa fa-question-circle" style="font-size:24px"></i> Help
                      <br><i id="n10" class="fa fa-question-circle" style="font-size:24px"></i> FAQ
                      <br> <i id="n77" class="fa fa-lock" style="font-size:24px"></i> Security</p>
              </div>
              <div class="man6">

                  <pre>

              </pre>
                  <p id="p14">Payment Metood
                      <br>
                      <br><i id="n15" class="fa fa-cc-paypal" style="font-size:24px"></i> <i id="n16" class="fa fa-cc-visa" style="font-size:24px"></i> <i id="n17" class="fa fa-credit-card" style="font-size:24px"></i> <i id="n18" class="fa fa-cc-mastercard" style="font-size:24px"></i></p>

              </div>
              <div class="man45">

                  <pre>

            </pre>
                  <p id="p45">Copyright @ 2019-2020
                      <br>Devoloped by :
                      <br>Tutul Hossain & Rakib Hassan</p>

              </div>

          </div>
          <div class="man44">

          </div>
  </body>

</html>