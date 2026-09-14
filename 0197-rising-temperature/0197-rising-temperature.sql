select today.id
from weather today
join weather yesterday
where datediff(today.recordDate,yesterday.recordDate)=1
and (today.temperature>yesterday.temperature)