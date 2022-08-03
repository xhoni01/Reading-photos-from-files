<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Load_Administrator</title>
</head>
<body>

<button class="load__admin__btn" type="button" onClick="window.location.reload();" >Refresh</button>
<?php
    $dir_path = "images/";
    $extensions_array = array('jpg','png','jpeg');

    if(is_dir($dir_path))
    {
        $files = scandir($dir_path);
        
        for($i = count($files)-1; $i >= 0 ; $i--)
        {
            if($files[$i] !='.' && $files[$i] !='..')
            {
                // get file name
                echo "File Name -> $files[$i]<br>";
                
                // get file extension
                $file = pathinfo($files[$i]);
                $extension = $file['extension'];
                
            // check file extension
                if(in_array($extension, $extensions_array))
                {
                // show image
                echo "<img src='$dir_path$files[$i]' style='width:500px;height:auto;display:block;margin-left:auto; margin-right:auto;'><br>";
                }
            }
        }
        
    }
    ?>

    <script>
        var user1="First";
        var username=prompt('Please Log in. Username:',' ');
        if (username==user1){
        var pass1="FirstAdmin";
        password=prompt('If you are suppose to be here you have a password. Please type                  it now:',' ');
            if (password==pass1){
                alert("correct!")
            }
            else {
                window.location="scanner_login.html";
            }
        }
        else {
        window.location="scanner_login.html";
        }
    </script>
</body>
</html>

