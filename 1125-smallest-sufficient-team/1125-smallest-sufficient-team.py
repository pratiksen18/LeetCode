class Solution(object):
    def smallestSufficientTeam(self, req_skills, people):
        """
        :type req_skills: List[str]
        :type people: List[List[str]]
        :rtype: List[int]
        """
        n = len(req_skills)
        m = len(people)
        skills = {skill: i for i, skill in enumerate(req_skills)}
        dp = {0: []}
        for i, p in enumerate(people):
            currSkills = 0
            for skill in p: currSkills |= 1 << skills[skill]
            for skill_set, team in list(dp.items()):
                new_set = skill_set | currSkills
                if new_set not in dp or len(dp[new_set]) > len(team) + 1:
                    dp[new_set] = team + [i]
        return dp[(1 << n) - 1]
        