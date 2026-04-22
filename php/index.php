<form method="post">
    Enter name: <input type="text" name="name">
    <input type="submit">
</form>

<?php
if($_POST) {
    $name = $_POST['name'];
    echo "Hello " . $name;
}
?>