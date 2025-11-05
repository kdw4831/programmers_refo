-- 코드를 입력하세요
SELECT ao.animal_id as animal_id, ao.name as name
FROM animal_ins AS ai RIGHT JOIN animal_outs AS ao
ON ai.animal_id = ao.animal_id
WHERE ai.animal_id is null;