function calculateTip() {
	var money = document.getElementsById('money').value;
	var selectBox = document.getElementsById('selectBox').value;

	if (money === "" || selectBox == 0) {
		alert("please fill everything");
		return;
	}

	var total = (money * selectBox);
	total = math.round(total * 100);
	total = total.toFixed(2);

	document.getElementsById("Endtip").style.display = "block";
	document.getElementsById("Tip").innerHTML = total;

}

document.getElementsById("Generate").onClick = function() {
	calculateTip();
};