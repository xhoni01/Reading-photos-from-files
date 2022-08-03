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
    <button type="button" onClick="window.location.reload();" >Refresh</button>
    <?php
    $dir_path = "images/";
    $extensions_array = array('jpg','png','jpeg');

    if(is_dir($dir_path))
    {
        $files = scandir($dir_path);
        
        for($i = count($files)-2; $i >=0 ; $i-=2)
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
    </body>
    </html>


