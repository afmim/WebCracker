<?php 
if(isset($_GET["pwd"])){ 
if($_GET["pwd"]=="aabza"){
     echo"Password found";
}
else{
    echo"Password notfound";
}

?>
<?php }else { ?>
<!DOCTYPE html>
<html lang="fr">
<head>
    <title>Document</title>
</head>
<body>
    <form method="GET">
        <input type="text" name="login">
        <input type="password" name="pwd">
        <input type="submit" value="valider">
    </form>
</body>
</html>
<?php } ?>