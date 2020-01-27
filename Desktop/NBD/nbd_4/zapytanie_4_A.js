printjson(db.people.aggregate({
		$group:{ 
       		_id: "$nationality", 
			avgBmi: {'$avg': {$divide:[{ '$toDouble': '$weight' },{$multiply:[{ '$toDouble': '$height'},{ '$toDouble': '$height'}]}]}},
			minBmi: {'$min': {$divide:[{ '$toDouble': '$weight' },{$multiply:[{ '$toDouble': '$height'},{ '$toDouble': '$height'}]}]}},
			maxBmi: {'$max': {$divide:[{ '$toDouble': '$weight' },{$multiply:[{ '$toDouble': '$height'},{ '$toDouble': '$height'}]}]}}
		}}
))