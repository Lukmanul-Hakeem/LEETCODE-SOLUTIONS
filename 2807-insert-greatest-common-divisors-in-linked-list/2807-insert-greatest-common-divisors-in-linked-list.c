/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
typedef struct ListNode node;
node *create_node(int num)
{
    node *temp = (node *)malloc(sizeof(node));
    temp->next = NULL;
    temp->val = num;
    return temp;
}
int gcd(int a, int b)
{
    if (a == 0)
        return b;
    if (b == 0)
        return a;

    if (a >= b)
        return gcd(b, a % b);
    else
        return gcd(a, b % a);
}
struct ListNode *insertGreatestCommonDivisors(struct ListNode *head)
{
    node *temp = head;
    while (temp->next != NULL)
    {
        int val = gcd(temp->val, temp->next->val);
        node *gcdn = create_node(val);
        gcdn->next = temp->next;
        temp->next = gcdn;
        temp = temp->next->next;
    }
    return head;
}