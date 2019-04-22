int count = 3
while (count>0){
	println(count)
	count--
}

for (i=0;i<3;i++) {
	println("Outputing -"+i)
	i+1
}

String[] array = ['Cat','Dog','Tiger']
for (a in array) {
	println(a)
}

String[] statuses = ['Right', 'Wrong', 'Continue', 'Break', 'NeverHappen']
for ( status in statuses ) {
	if ( status == 'Continue' ) {
		println("Continue will be not outputted...")
		continue
	}
	else if ( status == 'Break') {
		println("Break and NeverHappen will be not outputted..")
		break
	}
	else {
		println("Status: "+status)

	}
}

int i = 0;
int j = 1;
switch(i) {
	case 0:
		switch(j) {
			case 0:
			  println("i is 0, j is 0!")
			  break
			case 1:
			  println("i is 0, j is 1!")
			  break
			default:
			  println("Nested default for the embeded switch")
		}	
	break
	default:
	  println("Default for the top switch")
}