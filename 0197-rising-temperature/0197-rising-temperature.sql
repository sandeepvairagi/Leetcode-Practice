select today.id
from weather today
inner join weather yesterday
where datediff(today.recordDate,yesterday.recordDate)=1
and (today.temperature>yesterday.temperature)